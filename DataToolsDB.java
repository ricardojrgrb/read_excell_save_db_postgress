import com.sun.org.apache.regexp.internal.RE;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.BlockingQueue;

public class DataToolsDB //implements Runnable
{
//    protected BlockingQueue<String> queue = null;

//    public DataToolsDB(BlockingQueue<String> queue)
//    {
//        this.queue = queue;
//    }

//    @Override
//    public void run()
//    {
//        ReadExcelFile readExcelFile = new ReadExcelFile();
//        try {
//            List<WordDataFile> dataFileList =  readExcelFile.ReadFile();
//            this.insertDB((ArrayList<WordDataFile>) dataFileList);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }

    public static void insertDB(ArrayList<WordDataFile> wordDataFiles) {

        String sql = "";

        DataBaseService dataBaseService = new DataBaseService();
        int insert = 0;

        for (WordDataFile wordDataFile: wordDataFiles) {
            sql = "INSERT INTO tbl_autores (idn_empreendimento, idn_digs, dsc_titulo, investimento_total, sig_uf, txt_municipios, "
                  + "txt_executores, dsc_orgao, idn_estagio, dat_ciclo, dat_selecao, dat_conclusao_revisada, obra_latitude, "
                  + "obra_longitude, emblematica, observacao) "
                  + "VALUES "
                  + "('" + wordDataFile.getIdn_empreendimento() + "', '" + wordDataFile.getIdn_digs() + "', '" + wordDataFile.getDsc_titulo
                                                                                                                              () + "', "
                  + "'" + wordDataFile.getInvestimento_total() + "', '" + wordDataFile.getSig_uf() + "', '"
                  + wordDataFile.getTxt_municipios() + "', "
                  + "'" + wordDataFile.getTxt_executores() + "', '" + wordDataFile.getDsc_orgao() + "', '" + wordDataFile.getIdn_estagio()
                  + "', "
                  + "'" + wordDataFile.getDat_ciclo() + "', '" + wordDataFile.getDat_selecao() + "', '"
                  + wordDataFile.getDat_conclusao_revisada()
                  + "', '" + wordDataFile.getObra_latitude() + "', '" + wordDataFile.getObra_longitude() + "', '"
                  + wordDataFile.getEmblematica()
                  + "', '" + wordDataFile.getObservacao() + "');";

            insert = dataBaseService.executeUpdate(sql);
        }

        if (insert >= 1) {
            System.out.println("Inserção realizada!");
        } else {
            System.err.println("Inserção NÃO realizada!");
        }
    }

    static void listDB() {
        String sql = "SELECT * FROM tbl_autores";
        DataBaseService dataBaseService = new DataBaseService();

        try {
            ResultSet consulta = dataBaseService.executeQuery(sql);
            while(consulta.next())
            {
                int idn_empreendimento = consulta.getInt("idn_empreendimento");
                int idn_digs = consulta.getInt("idn_digs");;
                String dsc_titulo = consulta.getString("dsc_titulo");
                String investimento_total = consulta.getString("investimento_total");
                String sig_uf = consulta.getString("sig_uf");
                String txt_municipios = consulta.getString("txt_municipios");
                String txt_executores = consulta.getString("txt_executores");
                String dsc_orgao = consulta.getString("dsc_orgao");
                int idn_estagio = consulta.getInt("idn_estagio");
                int dat_ciclo = consulta.getInt("dat_ciclo");
                int dat_selecao = consulta.getInt("dat_selecao");
                int dat_conclusao_revisada = consulta.getInt("dat_conclusao_revisada");
                String obra_latitude = consulta.getString("obra_latitude");
                String obra_longitude = consulta.getString("obra_longitude");
                String emblematica = consulta.getString("emblematica");
                String observacao = consulta.getString("observacao");

                System.out.println(idn_empreendimento+" - "+idn_digs+" - "+dsc_titulo+" - "+investimento_total+" - "+
                                  sig_uf+" - "+txt_municipios+" - "+txt_executores+" - "+dsc_orgao+" - "+idn_estagio+" - "+
                                  dat_ciclo+" - "+dat_selecao+" - "+dat_conclusao_revisada+" - "+obra_latitude+" - "+obra_longitude+" - "+
                                  emblematica+" - "+observacao);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
