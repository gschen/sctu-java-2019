package day20190829;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.filechooser.FileNameExtensionFilter;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PreviewFileDialog extends JFrame {

    private JPanel contentPane;
    private JFileChooser fileChooser;
    private ImagePreviewer imageLabel;
    private ImagePreviewer previewer;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        PreviewFileDialog frame = new PreviewFileDialog();
        frame.setVisible(true);
    }

    /**
     * Create the frame.
     */
    public PreviewFileDialog() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 629, 450);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setLayout(new BorderLayout(0, 0));
        setContentPane(contentPane);

        JPanel panel = new JPanel();
        contentPane.add(panel, BorderLayout.NORTH);

        JButton chooseButton = new JButton("\u9009\u62E9\u56FE\u7247\u6587\u4EF6");
        chooseButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                do_button_actionPerformed(e);
            }
        });
        panel.add(chooseButton);

        imageLabel = new ImagePreviewer((JFileChooser) null);
        contentPane.add(imageLabel, BorderLayout.CENTER);
        initFileChooser();
    }

    /**
     * ��ʼ���ļ�ѡ����
     */
    private void initFileChooser() {
        fileChooser = new JFileChooser();// �����ļ�ѡ����
        previewer = new ImagePreviewer(fileChooser);// ����ͼƬԤ����ǩ
        fileChooser.setFileFilter(new FileNameExtensionFilter("ͼƬ�ļ�", "jpg", "gif", "png"));
        // Ϊָ�����Ա������¼�������
        fileChooser.addPropertyChangeListener("SelectedFileChangedProperty", new PropertyChangeListener() {
            public void propertyChange(PropertyChangeEvent evt) {
                // ���Ըı�ʱ����Ԥ����ǩ��ͼƬ
                previewer.setImageFile((File) evt.getNewValue());
            }
        });
        fileChooser.setAccessory(previewer);
    }

    /**
     * ѡ��ͼƬ�ļ���ť���¼�������
     * 
     * @param e
     */
    protected void do_button_actionPerformed(ActionEvent e) {
        int option = fileChooser.showOpenDialog(this);// ��ʾ���ļ��Ի���
        if (option == JFileChooser.APPROVE_OPTION) {
            // ��ȡѡ����ļ�����
            File file = fileChooser.getSelectedFile();
            // ���´�����ͼƬ
            imageLabel.setImageFile(file);
        }
    }
}

/**
 * �Զ���ͼƬԤ����ǩ
 * 
 * @author ����ξ
 */
class ImagePreviewer extends JLabel {
    public ImagePreviewer(JFileChooser chooser) {
        // ��ʼ��С
        setPreferredSize(new Dimension(200, 200));
        setHorizontalAlignment(JLabel.CENTER);// ˮƽ����
        setBorder(new LineBorder(Color.GRAY));// ���ñ߿�
        setOpaque(true);// ��ǩ��͸��
        setBackground(Color.WHITE);// ���ñ���ɫ
        setText("û������ͼƬ");// Ĭ���ı�
    }

    /**
     * ���ñ�ǩͼƬ�ķ���
     * 
     * @param file
     */
    public void setImageFile(File file) {
        setText("");// ���ͼƬԤ����ǩ���ı�
        if (file == null) {// ����ļ�����Ϊ��
            setText("û������ͼƬ");// ����Ĭ����ʾ�ı�
            return;// ��ֹ����
        }
        // ����ͼ�����
        ImageIcon icon = new ImageIcon(file.getPath());
        if (icon.getIconWidth() > getWidth()) {// ����ͼ���С
            icon = new ImageIcon(icon.getImage().getScaledInstance(getWidth(), -1, Image.SCALE_DEFAULT));
        }
        setIcon(icon);// Ϊ��ǩ����ͼ��
        repaint();// ���»��ƽ���
    }
}