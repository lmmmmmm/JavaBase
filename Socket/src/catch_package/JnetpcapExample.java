package catch_package;

import org.jnetpcap.Pcap;
import org.jnetpcap.PcapIf;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author lming.41032@gmail.com
 * @date 19-3-4 下午11:45
 */
public class JnetpcapExample {

    public static void main(String[] args) {
        List<PcapIf> devs = new ArrayList<>();
        final StringBuilder err = new StringBuilder();
        int allDevs = Pcap.findAllDevs(devs, err);
        if (Pcap.NOT_OK == allDevs || devs.isEmpty()) {
            JOptionPane.showMessageDialog(null, err.toString(), "error error error!"
                    , JOptionPane.ERROR_MESSAGE);
        }

        for (PcapIf pcapIf : devs) {
            System.out.println(pcapIf);
        }
    }
}
