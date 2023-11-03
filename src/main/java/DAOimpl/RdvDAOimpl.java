package DAOimpl;

import DAO.RdvDao;
import Model.Rdv;
import java.util.List;

public class RdvDAOimpl implements RdvDao {

    public RdvDAOimpl() {

    }

    @Override
    public Rdv getById(Long id) { return null; }

    @Override
    public void insert(List<Rdv> RdvList, Rdv rdv) { RdvList.add(rdv); }

    @Override
    public void delete(List<Rdv> RdvList, Rdv rdv) {
        RdvList.remove(rdv);
    }
}
