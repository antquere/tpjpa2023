package DAO;

import Model.Professional;
import Model.Slot;
import java.util.List;

public interface ProfessionalDao extends DAO<Professional> {

    List<Slot> getAllSlots(Professional pro);

    Professional createProfessional(Professional pro);

    void setNewSlots(Professional pro, List<Slot> newSlots);

    void setTimeStart(Slot slot,Long timeStart);

    void setTimeEnd(Slot slot, Long timeEnd);
}
