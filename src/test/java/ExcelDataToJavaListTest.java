import com.poiji.bind.Poiji;

import java.io.File;
import java.util.List;

public class ExcelDataToJavaListTest {

    public static void main(String[] args) {
        File file = new File("PoijiAPIExcel.xlsx");
        List<InvoiceExcel> invoices = Poiji.fromExcel(file,InvoiceExcel.class);
        System.out.println("Printing List Data = " + invoices);
    }
}
