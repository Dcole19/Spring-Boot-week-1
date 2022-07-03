package Dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;
import Entity.Kayak;
import Entity.KayakName;
import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class DefaultKayakDao implements KayakDao{

  
  @Autowired
  private NamedParameterJdbcTemplate jdbcTemplate;

  @Override
  public List<Kayak> fetchKayaks(String kayakId, Kayak KayakBrand) {
    log.info("DAO: kayakId{}, kayakBrand={}", kayakId, KayakBrand);
  
  //@formatter:off
    String sql = ""
        + "SELECT * "
        + "FROM kayak "
        + "WHERE kayakid = :kayakid and kayakbrand = :kayakbrand";
  //@formatter:on
    
    Map<String, Object> params = new HashMap<>();
    params.put("kayakid", kayakId);
    params.put("kayakbrand", KayakBrand.toString());
    
    return jdbcTemplate.query(sql,  params, new RowMapper<>() {
      
      @Override
      public Kayak mapRow(ResultSet rs, int rowNum) throws SQLException{
        //@formatter:off
        return Kayak.builder()
            .kayakPK(rs.getLong("kayak_pk"))
            .kayakId(new String(rs.getString("kayakid")))
            .kayakName(KayakName.valueOf(rs.getString("kayakname")))
            .build();
      }
      
    });
  }

  @Override
  public Optional<Kayak> createKayaks(String kayakId, Kayak kayakBrand, Kayak KayakName) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Optional<Kayak> updateKayaks(String kayakId, Kayak kayakBrand, Kayak kayakName) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Optional<Kayak> deleteKayaks(String kayakId, Kayak kayakBrand) {
    // TODO Auto-generated method stub
    return null;
  }}
  
  