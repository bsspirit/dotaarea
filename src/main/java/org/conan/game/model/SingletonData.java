package org.conan.game.model;

import org.conan.game.dota.generated.HeroesType;
import org.conan.game.model.client.DotaClient;
import org.conan.game.system.DotaConstants;

final public class SingletonData {

    private static HeroesType heroes;

    private SingletonData() {
    }

    synchronized public static HeroesType getInstance() {
        if (heroes == null) {
            heroes = DotaClient.unmarshaller(DotaConstants.DOTA6_67);
        }
        System.out.println(heroes.getName() + "  " + heroes.getVersion());
        return heroes;
    }

}
