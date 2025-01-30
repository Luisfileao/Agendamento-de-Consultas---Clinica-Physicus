package view;

import com.toedter.calendar.IDateEvaluator;
import control.DadosControle;
import java.awt.Color;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class ConfigEvaluator implements IDateEvaluator {

    private Calendar calendario = Calendar.getInstance();
    private String nomeMedico;
    private DadosControle controle = new DadosControle();

    public void setNomeMedico(String nomeMedico) {
        this.nomeMedico = nomeMedico;
    }

    @Override
    public boolean isSpecial(Date date) {
        return false;
    }

    @Override
    public Color getSpecialForegroundColor() {
        return null;
    }

    @Override
    public Color getSpecialBackroundColor() {
        return null;
    }

    @Override
    public String getSpecialTooltip() {
        return null;
    }

    @Override
    public boolean isInvalid(Date date) {
        this.calendario.setTime(date);
        ArrayList<Date> diasCheios = this.controle.consultaDiasCheios(this.nomeMedico);
        LocalDate dataHoje = LocalDate.now();

        if (this.calendario.get(Calendar.DAY_OF_WEEK) == 1 || this.calendario.get(Calendar.DAY_OF_WEEK) == 7) {
            return true;
        } else if (diasCheios.contains(date)) {
            return true;
        }

        return false;
    }

    @Override
    public Color getInvalidForegroundColor() {
        return Color.RED;
    }

    @Override
    public Color getInvalidBackroundColor() {
        return null;
    }

    @Override
    public String getInvalidTooltip() {
        if (this.calendario.get(Calendar.DAY_OF_WEEK) == 1 || this.calendario.get(Calendar.DAY_OF_WEEK) == 7) {
            return "Fim de Semana";
        }
        return "Horários de Agendamento Esgotados";
    }
}
