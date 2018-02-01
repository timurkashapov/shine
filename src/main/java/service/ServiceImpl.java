package service;

import dao.Dao;
import service.Service;

/**
 *
 */
public class ServiceImpl implements Service {

    /**
     *
     */
    private Dao dao;

    /**
     *
     */
    public void doService() {
        dao.doRequest();
    }
}
