package action;

import com.opensymphony.xwork2.ActionSupport;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestAction extends ActionSupport {

    private List<String> list = null;
    private Map<Integer, String> map = null;

    public TestAction(){
        updateData();
    }

    public void updateData() {
        list = new ArrayList<>();
        for (int i = 10; i < 30; i++) {
            list.add("aa" + i);
        }

        map = new HashMap<>();
        for (int i = 30; i < 50; i++) {
            map.put( i, "aa" + i);
        }
    }

    public String testAll() {
        return "testAll";
    }

    public String test1() {
        return "test1";
    }

    public String test2() {
        return "test2";
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public Map<Integer, String> getMap() {
        return map;
    }

    public void setMap(Map<Integer, String> map) {
        this.map = map;
    }
}
