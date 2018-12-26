package pojo;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Hu Yongpeng
 * @Description:
 * @Date: Created in 0:41 2018/12/27
 */

public class ResponseJsonResult {

    private Integer status = 200;
    private String msg = "SUCCESS";
    private Object obj;
    private List<?> list = new ArrayList<Object>();

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getObj() {
        return obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }

    public List<?> getList() {
        return list;
    }

    public void setList(List<?> list) {
        this.list = list;
    }
}
