package table;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import model.Vulcao;

 
public class VulcaoTableModel extends AbstractTableModel{

    public static final int COL_ID_VULCAO = 0;
    public static final int COL_NOME_VULCAO = 1;
    public static final int COL_FORMADO_POR_VULCAO = 2;
    public static final int COL_ULTIMA_ERUPCAO_VULCAO = 3;
    public static final int COL_STATUS_VULCAO = 4;
    public static final int COL_COORDENADAS_VULCAO = 5;
    public static final int COL_PAIS_VULCAO = 6;
    public static final int COL_TIPOLAVA_VULCAO = 7;
    public static final int COL_DESCRICAOS_VULCAO = 8;
    public static final int COL_ERUPCAO_VULCANICA_VULCAO = 9;
    public ArrayList<Vulcao> lista;

    public VulcaoTableModel(ArrayList<Vulcao> l) {
        lista = new ArrayList<Vulcao>(l);
    }
    
      
    @Override
    public int getRowCount() {
       return lista.size();
    }

    @Override
    public int getColumnCount() {
        return 10;
     }

    @Override
    public Object getValueAt(int linhas, int colunas) {
        Vulcao vulcao = lista.get(linhas);
        if(colunas == COL_ID_VULCAO) return vulcao.getId();
        if(colunas == COL_NOME_VULCAO) return vulcao.getNome();
        if(colunas == COL_FORMADO_POR_VULCAO) return vulcao.getFormadoPor();
        if(colunas == COL_ULTIMA_ERUPCAO_VULCAO) return vulcao.getUltimaErupcao();
        if(colunas == COL_STATUS_VULCAO) return vulcao.getStatus();
        if(colunas == COL_COORDENADAS_VULCAO) return vulcao.getCoordenadas();
        if(colunas == COL_PAIS_VULCAO) return vulcao.getPais();
        if(colunas == COL_TIPOLAVA_VULCAO) return vulcao.getTipoLava();
        if(colunas == COL_DESCRICAOS_VULCAO) return vulcao.getDescricao();
        if(colunas == COL_ERUPCAO_VULCANICA_VULCAO) return vulcao.getErupcaoVulcanica();
        return "";


     }
    
    @Override
    public String getColumnName(int colunas) {
        if(colunas == COL_ID_VULCAO) return "id";
        if(colunas == COL_NOME_VULCAO) return  "nome";
        if(colunas == COL_FORMADO_POR_VULCAO) return "formadoPor";
        if(colunas == COL_ULTIMA_ERUPCAO_VULCAO) return "ultimaErupcao";
        if(colunas == COL_STATUS_VULCAO) return "status";
        if(colunas == COL_COORDENADAS_VULCAO) return "coordenadas";
        if(colunas == COL_PAIS_VULCAO) return "pais";
        if(colunas == COL_TIPOLAVA_VULCAO) return "TipoLava";
        if(colunas == COL_DESCRICAOS_VULCAO) return "Descricao";
        if(colunas == COL_ERUPCAO_VULCANICA_VULCAO) return "ErupcaoVulcanica";
        return "";
    }
}
