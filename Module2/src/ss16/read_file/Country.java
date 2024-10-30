package ss16.read_file;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Country {
    private int id;
    private String code;
    private String name;
    public Country() {}
    public Country(int id, String code, String name) {
        this.id = id;
        this.code = code;
        this.name = name;
    }
    public List<Country> getCountries() {
        File file = new File("src/ss16/read_file/Country.csv");
        List<Country> countries = new ArrayList<Country>();
        FileReader fileReader;

            try {
                fileReader = new FileReader(file);
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                String line = "";
                String data [];
                while ((line = bufferedReader.readLine())!=null){
                    data  = line.split(",");
                    countries.add(new Country(Integer.parseInt(data[0]),data[1],data[2]));
                }
            } catch (IOException e) {
                System.err.println("Lỗi");
            }

        return countries;
    }

    @Override
    public String toString() {
        return "Country: " +
                ", id: " + id +
                ", code: " + code + '\'' +
                ", name: " + name + '\'' + '\n';
    }
}
