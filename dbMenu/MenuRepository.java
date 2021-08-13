package dbMenu;

import  Things.Menu;

import java.util.List;

public interface MenuRepository {
    boolean AddMenu(Menu menu);
    boolean ModifyMenu(Menu OldMenu,Menu NewMenu);
    boolean DeleteMenu(Menu menu);
    boolean ExistMenu(Menu menu);
    boolean AcceptMenu(Menu menu,String name);
    List<Menu> check();
}
