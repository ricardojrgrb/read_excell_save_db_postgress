import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import java.util.concurrent.BlockingQueue;

public class ReadExcelFile //implements Runnable
{
//    protected BlockingQueue<String> queue = null;
    String filePath;

//    @Override
//    public void run() {
//        try {
//            this.InitReadFile();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//    }

//    public ReadExcelFile()
//    {
//        this.queue = queue;
//        this.filePath = filePath;
//    }

//    private void InitReadFile() throws InterruptedException {
//        try {
//            queue.put(filePath);
//            this.ReadFile(filePath);
//            queue.put("DONE");
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//    }

    public ArrayList<WordDataFile> ReadFile(String filePath) throws IOException
    {
        try
        {
            FileInputStream file = new FileInputStream(new File(filePath));
            HSSFWorkbook workbook = new HSSFWorkbook(file);
            HSSFSheet sheet = workbook.getSheetAt(0);

            ArrayList<WordDataFile> wordDataFiles = new ArrayList<>();

            Iterator rowIterator = sheet.rowIterator();

            while (rowIterator.hasNext())
            {
                Row row = (Row) rowIterator.next();

                if(row.getRowNum() == 0)
                {
                    continue;
                }

                Iterator cellIterator = row.cellIterator();
                WordDataFile wordDataFile = new WordDataFile();
                wordDataFiles.add(wordDataFile);

                while (cellIterator.hasNext()) {
                    Cell cell = (Cell) cellIterator.next();
                    switch (cell.getColumnIndex()) {
                        case 0:
                            wordDataFile.setIdn_empreendimento((int) cell.getNumericCellValue());
                            break;
                        case 1:
                            wordDataFile.setIdn_digs((int) cell.getNumericCellValue());
                            break;
                        case 2:
                            wordDataFile.setDsc_titulo(cell.getStringCellValue());
                            break;
                        case 3:
                            wordDataFile.setInvestimento_total(cell.getStringCellValue());
                            break;
                        case 4:
                            wordDataFile.setSig_uf(cell.getStringCellValue());
                            break;
                        case 5:
                            wordDataFile.setTxt_municipios(cell.getStringCellValue());
                            break;
                        case 6:
                            wordDataFile.setTxt_executores(cell.getStringCellValue());
                            break;
                        case 7:
                            wordDataFile.setDsc_orgao(cell.getStringCellValue());
                            break;
                        case 8:
                            wordDataFile.setIdn_estagio((int) cell.getNumericCellValue());
                            break;
                        case 9:
                            wordDataFile.setDat_ciclo((int) cell.getNumericCellValue());
                            break;
                        case 10:
                            wordDataFile.setDat_selecao((int) cell.getNumericCellValue());
                            break;
                        case 11:
                            wordDataFile.setDat_conclusao_revisada((int) cell.getNumericCellValue());
                            break;
                        case 12:
                            wordDataFile.setObra_latitude(cell.getStringCellValue());
                            break;
                        case 13:
                            wordDataFile.setObra_longitude(cell.getStringCellValue());
                            break;
                        case 14:
                            wordDataFile.setEmblematica(cell.getStringCellValue());
                            break;
                        case 15:
                            wordDataFile.setObservacao(cell.getStringCellValue());
                            break;
                    }
                }
            }

//            for (WordDataFile wordDataFile : wordDataFiles) {
//
//                System.out.println(wordDataFile.getIdn_empreendimento() +
//                                   " – " + wordDataFile.getIdn_digs() +
//                                   " – " + wordDataFile.getDsc_titulo() +
//                                   " – " + wordDataFile.getInvestimento_total() +
//                                   " – " + wordDataFile.getSig_uf() +
//                                   " – " + wordDataFile.getTxt_municipios() +
//                                   " – " + wordDataFile.getTxt_executores() +
//                                   " – " + wordDataFile.getDsc_orgao() +
//                                   " – " + wordDataFile.getIdn_estagio() +
//                                   " – " + wordDataFile.getDat_ciclo() +
//                                   " – " + wordDataFile.getDat_selecao() +
//                                   " – " + wordDataFile.getDat_conclusao_revisada() +
//                                   " – " + wordDataFile.getObra_latitude() +
//                                   " – " + wordDataFile.getObra_longitude() +
//                                   " – " + wordDataFile.getEmblematica() +
//                                   " – " + wordDataFile.getObservacao());
//
//            }

            file.close();
            workbook.close();

            return wordDataFiles;
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
        return null;
    }
}
