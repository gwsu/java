package jtable;

import javax.swing.*;
import javax.swing.table.TableColumn;
import java.awt.*;

public class Jtable {

    public static void main(String[] args) {
        JFrame jf = new JFrame("���Դ���");
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        // ����������壬ʹ�ñ߽粼��
        JPanel panel = new JPanel(new BorderLayout());

        // ��ͷ��������
        Object[] columnNames = {"����", "����", "��ѧ", "Ӣ��", "�ܷ�"};

        // �������������
        Object[][] rowData = {
                {"����", 80, 80, 80, 240},
                {"John", 70, 80, 90, 240},
                {"Sue", 70, 70, 70, 210},
                {"Jane", 80, 70, 60, 210},
                {"Joe", 80, 70, 60, 210}
        };

        // ����һ�����ָ�� ���������� �� ��ͷ
        JTable table = new JTable(rowData, columnNames);

        // ������Ԫ��༭����ʹ���ı�����Ϊ�༭���
        MyCellEditor cellEditor = new MyCellEditor(new JTextField());

        // ������������������У��������е�Ԫ��ı༭��
        for (int i = 1; i < columnNames.length; i++) {
            // ���� ���� ��ȡ �����
            TableColumn tableColumn = table.getColumn(columnNames[i]);
            // ���� ����� �� ��Ԫ��༭��
            tableColumn.setCellEditor(cellEditor);
        }

        // �� ��ͷ ��ӵ�����������ʹ����ͨ���м�������ӱ��ʱ����ͷ �� ���� ��Ҫ�ֿ���ӣ�
        panel.add(table.getTableHeader(), BorderLayout.NORTH);
        // �� ������� ��ӵ���������
        panel.add(table, BorderLayout.CENTER);

        jf.setContentPane(panel);
        jf.pack();
        jf.setLocationRelativeTo(null);
        jf.setVisible(true);
    }

    /**
     * ֻ�����������ֵĵ�Ԫ��༭��
     */
    public static class MyCellEditor extends DefaultCellEditor {

        public MyCellEditor(JTextField textField) {
            super(textField);
        }

        public MyCellEditor(JCheckBox checkBox) {
            super(checkBox);
        }

        public MyCellEditor(JComboBox comboBox) {
            super(comboBox);
        }

        @Override
        public boolean stopCellEditing() {
            // ��ȡ��ǰ��Ԫ��ı༭�����
            Component comp = getComponent();

            // ��ȡ��ǰ��Ԫ��༭�������ֵ
            Object obj = getCellEditorValue();

            // �����ǰ��Ԫ��༭�������ֵ�������֣��򷵻� false����ʾ���ݷǷ������������ã��޷����棩
            if (obj == null || !obj.toString().matches("[0-9]*")) {
                // ���ݷǷ�ʱ�����ñ༭������ڵ�������ɫΪ��ɫ
                comp.setForeground(Color.RED);
                return false;
            }

            // ���ݺϷ�ʱ�����ñ༭������ڵ�������ɫΪ��ɫ
            comp.setForeground(Color.BLACK);

            // �Ϸ����ݽ������ദ��
            return super.stopCellEditing();
        }
    }

}