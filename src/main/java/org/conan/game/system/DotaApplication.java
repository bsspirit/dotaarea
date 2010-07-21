package org.conan.game.system;

import org.apache.wicket.Page;
import org.apache.wicket.protocol.http.HttpSessionStore;
import org.apache.wicket.protocol.http.WebApplication;
import org.apache.wicket.session.ISessionStore;
import org.conan.game.web.HomePage;
import org.conan.game.web.hero.Hero;

/**
 * @author Conan Zhang <mailto:bspsirit@163.com>
 */
public class DotaApplication extends WebApplication {

    @Override
    public Class<? extends Page> getHomePage() {
        return HomePage.class;
    }

    @Override
    protected void init() {
        super.init();
        getResourceSettings().setResourcePollFrequency(null);
        
        mountPagePath();
    }

    @Override
    protected ISessionStore newSessionStore() {
        return new HttpSessionStore(this);
    }
    
    private void mountPagePath(){
        mountBookmarkablePage("/hero", Hero.class);
    }
}
