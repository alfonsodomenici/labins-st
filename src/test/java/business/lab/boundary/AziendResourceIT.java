/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.lab.boundary;

import business.lab.entity.Azienda;
import java.util.List;
import javax.ws.rs.core.UriBuilder;
import org.jboss.resteasy.client.jaxrs.ResteasyClient;
import org.jboss.resteasy.client.jaxrs.ResteasyClientBuilder;
import org.jboss.resteasy.client.jaxrs.ResteasyWebTarget;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author utente
 */
public class AziendResourceIT {

    private final AziendeResourceInterfaces proxy;

    public AziendResourceIT() {
        final String path = "http://localhost:8080/labins/api/aziende";
        ResteasyClient client = new ResteasyClientBuilder().build();
        ResteasyWebTarget target = client.target(UriBuilder.fromPath(path));
        this.proxy = target.proxy(AziendeResourceInterfaces.class);
    }

    @Test
    public void createTest() {
        List<Azienda> findAll = this.proxy.findAll();
        Assert.assertTrue(findAll.isEmpty());
    }
}
