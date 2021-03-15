
// https://waytolearnx.com/2020/03/deplacer-le-fichier-vers-un-autre-repertoire-en-java.html
// https://waytolearnx.com/2020/03/recuperer-le-repertoire-courant-en-java.html
import java.io.*;
import java.nio.file.Files;
import java.nio.file.*;

public class PlacerXMLrepertoire {
    public static void main(String[] args) throws IOException {

        String repertoireCourtant = System.getProperty("user.dir");
        // System.out.println("Le répertoire courant est : " + repertoireCourtant);

        String src = repertoireCourtant + "\\cibleEnvoiEssai.xml";
        String dest = repertoireCourtant + "\\FichiersXML\\cibleEnvoiEssai.xml";
        Path tmp = Files.move(Paths.get(src), Paths.get(dest));

        if (tmp != null) {
            System.out.println("Fichier déplacé avec succès");
        } else {
            System.out.println("Impossible de déplacer le fichier");
        }
    }
}