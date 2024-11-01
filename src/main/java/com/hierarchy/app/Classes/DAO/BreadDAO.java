package com.hierarchy.app.Classes.DAO;

import com.hierarchy.app.Classes.Model.Bread;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.logging.log4j.LogManager;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class BreadDAO extends AbstractDAO<Bread, Integer> {

    private static final Logger logger = LogManager.getLogger(BreadDAO.class);

    public BreadDAO(SqlSessionFactory sqlSessionFactory) {
        super(sqlSessionFactory);
    }

    public void updateBreadName(int id, String newBreadName) {
        try (SqlSession session = sqlSessionFactory.openSession()) {
            Bread breadToUpdate = session.selectOne("BreadDAO.findById", id);
            if (breadToUpdate != null) {
                breadToUpdate.setBreadName(newBreadName);
                session.update("BreadDAO.updateBreadName", breadToUpdate);
                session.commit();
                logger.info("Bread name updated to: " + newBreadName + " for Bread ID: " + id);
            } else {
                logger.warn("Bread with ID " + id + " not found for updating name.");
            }
        }
    }


    @Override
    protected String getMapperNamespace() {
        return "BreadDAO";
    }

}
