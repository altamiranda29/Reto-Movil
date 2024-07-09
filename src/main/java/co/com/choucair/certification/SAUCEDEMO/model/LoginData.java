package co.com.choucair.certification.SAUCEDEMO.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.datatable.DataTable;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class LoginData {

    String email;
    String password;
    String incorrectPassword;

    public static List<LoginData> setData(DataTable table){
        List<LoginData> data = new ArrayList<>();
        List<Map<String, String>> mapList = table.asMaps();
        for (Map<String, String> map : mapList) {
            data.add(new ObjectMapper().convertValue(map, LoginData.class));
        }
        return data;
    }

    public String getIncorrectPassword() {
        return incorrectPassword;
    }

    public void setIncorrectPassword(String incorrectPassword) {
        this.incorrectPassword = incorrectPassword;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
