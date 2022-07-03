package com.kayaksales.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;
import com.promineotech.kayak.controllers.entities.Kayak;
import lombok.extern.slf4j.Slf4j;


@Component
@Slf4j
public class DefaultKayakSalesDao implements KayakSalesDao{
  
  @Autowired
  private NamedParameterJdbcTemplate jdbcTemplate;
  
  @Override
  public List<Kayak> fetchKayaks(String brand, String name){
    log.debug("DAO: brand={}, name={}", brand, name);
    
  //@Formatter:off  
    String sql = ""
        + "SELECT * "
        + "FROM brands "
        + "WHERE brand_id = :brand_id AND name = :name";
  //@formatter:on

    
    Map<String, Object> params = new HashMap<>();
    params.put("brand_id", brand.toString());
    params.put("name",name);
    
  return jdbcTemplate.query(sql, params, new RowMapper<>(){
      
    
    @Override
    public Kayak mapRow(ResultSet rs, int rowNum) throws SQLException {
      //@formatter:off
      return Kayak.builder()
          .kayak_id(rs.getLong("kayak_id"))
          .brand_id(new String(rs.getString("brand_id")))
          .name(new String(rs.getString("name")))
          .price(rs.getBigDecimal("price"))
          .width(rs.getBigDecimal("width"))
          .build();
      //@formatter:on
    }});
  }}