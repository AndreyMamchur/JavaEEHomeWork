package homework3.dao;

import homework3.entity.Goods;
import homework3.mappers.GoodsMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.List;

public class GoodsDaoImpl implements GoodsDao {

    private JdbcTemplate jdbcTemplate;

    public GoodsDaoImpl(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }


    @Override
    public void save(Goods goods) {
        String sql = "INSERT INTO goods(name, price, merchant) VALUES(?, ?, ?)";
        jdbcTemplate.update(sql, goods.getName(), goods.getPrice(), goods.getMerchant());
    }

    @Override
    public Goods getGoodsById(int id) {
        String sql = "SELECT * FROM goods WHERE id=?";
        return jdbcTemplate.queryForObject(sql, new GoodsMapper(), id);
    }

    @Override
    public Goods update(Goods newGoods) {
        String sql = "UPDATE goods SET name=?, price=?,merchant=? WHERE id=?";
        int update = jdbcTemplate.update(sql, newGoods.getName(), newGoods.getPrice(), newGoods.getMerchant(), newGoods.getId());
        System.out.println("return " + update);
        return null;
    }

    @Override
    public List<Goods> getAll() {
        String sql = "SELECT * FROM goods";
        return jdbcTemplate.query(sql, new GoodsMapper());
    }

    @Override
    public void delete(int id) {
        String sql = "DELETE FROM goods WHERE id=?";
        jdbcTemplate.update(sql, id);

    }

    @Override
    public void delete(String name) {
        String sql = "DELETE FROM goods WHERE name=?";
        jdbcTemplate.update(sql, name);
    }
}
