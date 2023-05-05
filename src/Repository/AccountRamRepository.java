/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

//dữ liệu lưu ở trong csdl trên Ram
import Vview.IAcountRepository;
import java.util.ArrayList;
import java.util.List;
import model.RoleConst;
import model.User;

public class AccountRamRepository implements IAcountRepository {

    private static final List<User> accounts = new ArrayList<User>();

    static {
        accounts.add(new User("quanly", "1234", RoleConst.QUAN_LY));
        accounts.add(new User("thukho", "8888", RoleConst.THU_KHO));
        accounts.add(new User("kinhdoanh", "9999", RoleConst.KINH_DOANH));

    }

    @Override
    public List<User> findAll() {
        return accounts;
    }

    @Override
    public User findByUsername(String username) {
        return accounts.stream()//chuyển sang dùng stream
                .filter(User// phần tử đại diện khi duyệt mảng
                        -> User.getTenDangNhap()//lấy tên đăng nhập của tài khoản
                        //so sánh với tên đăng nhập truyền vào
                        .equalsIgnoreCase(username))
                .findFirst()//lấy kết quả đầu tiên tìm được
                .orElse(null);//nếu k tìm thấy trả về null

    }

}
