package org.conan.game.model.client;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.conan.game.dota.generated.HeroesType;
import org.conan.game.system.DotaConstants;

public final class DotaClient {

    @SuppressWarnings("unchecked")
    public static HeroesType unmarshaller(String dota) {
        HeroesType heroes = null;
        JAXBContext jc;
        try {
            jc = JAXBContext.newInstance("org.conan.game.dota.generated");
            Unmarshaller um = jc.createUnmarshaller();
            InputStream is = new FileInputStream(DotaConstants.WEBINF_PATH + dota);
            JAXBElement o = (JAXBElement) um.unmarshal(is);
            heroes = (HeroesType) o.getValue();
            is.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        } catch (JAXBException ex) {
            ex.printStackTrace();
        }
        return heroes;
    }

}
