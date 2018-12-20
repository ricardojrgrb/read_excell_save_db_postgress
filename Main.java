import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Main
{
    public static void main(String[] args) throws IOException, InterruptedException
    {
        ReadExcelFile readExcelFile = new ReadExcelFile();

        try {
            List<WordDataFile> dataFileList =  readExcelFile.ReadFile("/Users/ricardojr/Desktop/TesteThread/pac201806.xls");
            DataToolsDB.insertDB((ArrayList<WordDataFile>) dataFileList);
            DataToolsDB.listDB();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

//    BlockingQueue<String> memoriaCompartilhada = new ArrayBlockingQueue<>(1000);
//
//    Thread readFile  = new Thread(new ReadExcelFile());
//    Thread insertDB = new Thread(new DataToolsDB(memoriaCompartilhada));
//
//    long initMillisTime = System.currentTimeMillis();
//
//        readFile.start();
//        insertDB.start();
//
//        while (readFile.isAlive() && insertDB.isAlive())
//        {
//        Thread.sleep(500);
//        }
//
//        System.out.println("TEMPO TOTAL: " + (System.currentTimeMillis()-initMillisTime));


//            for (WordDataFile wordDataFile: dataFileList)
//            {
//            System.out.println(wordDataFile.getIdn_empreendimento() +
//            " – " + wordDataFile.getIdn_digs() +
//            " – " + wordDataFile.getDsc_titulo() +
//            " – " + wordDataFile.getInvestimento_total() +
//            " – " + wordDataFile.getSig_uf() +
//            " – " + wordDataFile.getTxt_municipios() +
//            " – " + wordDataFile.getTxt_executores() +
//            " – " + wordDataFile.getDsc_orgao() +
//            " – " + wordDataFile.getIdn_estagio() +
//            " – " + wordDataFile.getDat_ciclo() +
//            " – " + wordDataFile.getDat_selecao() +
//            " – " + wordDataFile.getDat_conclusao_revisada() +
//            " – " + wordDataFile.getObra_latitude() +
//            " – " + wordDataFile.getObra_longitude() +
//            " – " + wordDataFile.getEmblematica() +
//            " – " + wordDataFile.getObservacao());
//            }
