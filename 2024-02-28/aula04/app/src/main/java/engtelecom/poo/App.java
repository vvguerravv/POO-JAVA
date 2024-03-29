package engtelecom.poo;

import barcode.CodigoDeBarra;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;

public class App {

    public static void main(String[] args) throws IOException, WriterException {
//        CodigoDeBarra.gerarCodigoDeBarra("104.016.469-20","cpf.png");

        String valor = "Guerra";

        QRCodeWriter qrCodeWriter = new QRCodeWriter();

        BitMatrix bitMatrix = qrCodeWriter.encode(valor, BarcodeFormat.QR_CODE,600,600);

        Path caminho = FileSystems.getDefault().getPath("qrcode.png");

        MatrixToImageWriter.writeToPath(bitMatrix,"PNG",caminho);

    }

}
