import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

public class StickersMaker {

    public void cria(InputStream inputStream, String nomeArquivo, String frase) throws IOException {

        // leitura da imagem
        BufferedImage imagemOriginal = ImageIO.read(inputStream);

        // cria nova imagem em memória com transparência e com tamanho novo
        int largura = imagemOriginal.getWidth();
        int altura = imagemOriginal.getHeight();
        var novaAltura = altura + 250;
        var novaImagem = new BufferedImage(largura, novaAltura, BufferedImage.TRANSLUCENT);

        // copiar imagem original para nova imagem
        Graphics graphics = novaImagem.getGraphics();
        graphics.drawImage(imagemOriginal, 0, 0, null);


        // configurar a fonte
        Font fonte = new Font(Font.SANS_SERIF, Font.BOLD, 100);
        graphics.setColor(Color.RED);
        graphics.setFont(fonte);

        // escrever um frase na nova imagem
        int xPoint = largura/2 - 33*frase.length();
        int yPoint = novaAltura-100;
        graphics.drawString(frase, xPoint, yPoint);

        // escrever a nova imagem em um arquivo
        ImageIO.write(novaImagem, "png", new File(nomeArquivo));
    }

}
