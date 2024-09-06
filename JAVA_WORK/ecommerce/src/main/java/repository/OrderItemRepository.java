package repository;

import domain.OrderItem;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import static repository.connection.DBConnectionUtil.*;

public class OrderItemRepository {

    Connection conn = null;
    PreparedStatement pstmt = null;
    ResultSet rs = null;


    public List<OrderItem> findAll() {
        return null;
    }


    public List<OrderItem> findByUsername() {
        return null;
    }


    public Boolean findByItemIdAndMemberId(Long itemId,Long memberId) throws SQLException {
        conn = getConnection();
        pstmt = conn.prepareStatement
                ("select * " +
                "from orderitem i" +
                "INNER JOIN order o ON o.order_id = i.order_id" +
                " where item_id = ? AND member_id = ?");

        pstmt.setLong(1,itemId);
        pstmt.setLong(2,memberId);
        rs = pstmt.executeQuery();

        if (rs.next()) {
            return true;
        } else {
            return false;
        }
    }
}
