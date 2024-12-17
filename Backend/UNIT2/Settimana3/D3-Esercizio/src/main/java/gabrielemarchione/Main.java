package gabrielemarchione;

import gabrielemarchione.Adapter.DataSource;
import gabrielemarchione.Adapter.Info;
import gabrielemarchione.Adapter.InfoAdapter;
import gabrielemarchione.Adapter.UserData;

import java.util.Calendar;

public class Main {
    public static void main(String[] args) {

        Info info = new Info();
        info.setNome("Mario");
        info.setCognome("Rossi");

        Calendar cal = Calendar.getInstance();
        cal.set(1990, Calendar.JANUARY, 1);
        info.setDataDiNascita(cal.getTime());

        DataSource infoAdapter = new InfoAdapter(info);

        UserData userData = new UserData();
        userData.getData(infoAdapter);

        System.out.println("Nome Completo: " + userData.getNomeCompleto());
        System.out.println("Età: " + userData.getEta());
    }
}