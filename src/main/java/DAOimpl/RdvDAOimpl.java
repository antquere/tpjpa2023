package DAOimpl;

import DAO.RdvDao;
import Model.Rdv;
import Model.Student;

import java.util.List;

public class RdvDAOimpl implements RdvDao {

    public RdvDAOimpl() {

    }

    @Override
    public Rdv getById(List<Rdv> lr, Long rdvId) {
        for (Rdv rdv : lr) {
            if (rdv.getId().equals(rdvId)) {
                return rdv;
            }
        }
        return null;
    }

    @Override
    public void insert(List<Rdv> RdvList, Rdv rdv) { RdvList.add(rdv); }

    @Override
    public void delete(List<Rdv> RdvList, Rdv rdv) {
        RdvList.remove(rdv);
    }
}
