package org.conan.game.model.client;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.conan.game.dota.generated.HeroesType;

/**
 * 
 * @author Conan Zhang <mailto:bsspirit@gmail.com>
 * 
 */
public class DotaClientTest {

    public static void main(String[] args) {
        unmarshaller();
    }

    @SuppressWarnings("unchecked")
    public static HeroesType unmarshaller() {
        HeroesType heroes = null;
        JAXBContext jc;
        try {
            jc = JAXBContext.newInstance("org.conan.game.dota.generated");
            Unmarshaller um = jc.createUnmarshaller();
            InputStream is = new FileInputStream("src/main/resources/dota6_67.xml");
            JAXBElement o = (JAXBElement) um.unmarshal(is);
            heroes = (HeroesType) o.getValue();
            is.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(DotaClientTest.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(DotaClientTest.class.getName()).log(Level.SEVERE, null, ex);
        } catch (JAXBException ex) {
            Logger.getLogger(DotaClientTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(heroes);
        return heroes;
    }

}
