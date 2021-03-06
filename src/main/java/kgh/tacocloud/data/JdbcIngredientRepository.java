//package kgh.tacocloud.data;
//
//import kgh.tacocloud.Ingredient;
//import lombok.RequiredArgsConstructor;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.stereotype.Repository;
//
//import java.sql.ResultSet;
//import java.sql.SQLException;
//
//@Repository
//@RequiredArgsConstructor
//public class JdbcIngredientRepository implements IngredientRepository{
//
//    private final JdbcTemplate jdbc;
//
//    @Override
//    public Iterable<Ingredient> findAll() {
//        return jdbc.query("select id, name, type from Ingredient",
//                this::mapRowToIngredient);
//    }
//
//    @Override
//    public Ingredient findById(String id) {
//        return jdbc.queryForObject(
//                "select id, name, type from Ingredient where id=?",
//                this::mapRowToIngredient, id);
//    }
//
//    private Ingredient mapRowToIngredient(ResultSet rs, int rowNum)
//            throws SQLException {
//        return new Ingredient(
//                rs.getString("id"),
//                rs.getString("name"),
//                Ingredient.Type.valueOf(rs.getString("type")));
//    }
//
//    @Override
//    public Ingredient save(Ingredient ingredient) {
//        jdbc.update(
//                "insert into Ingredient (id, name, type) values (?, ?, ?)",
//                ingredient.getId(),
//                ingredient.getName(),
//                ingredient.getType().toString());
//        return ingredient;
//    }
//}
