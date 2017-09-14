package io.arfirman1402.dev.guessthetrackf1.util;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import io.arfirman1402.dev.guessthetrackf1.R;
import io.arfirman1402.dev.guessthetrackf1.model.Question;
import io.arfirman1402.dev.guessthetrackf1.model.Track;

/**
 * Created by alodokter-it on 14/09/17 -- CommonFunction.
 */

public class CommonFunction {
    private static final int TOTAL_QUESTION = 10;
    private static final int TOTAL_OPTION = 4;

    private static List<Track> getTracks() {
        List<Track> tracks = new ArrayList<>();
        tracks.add(new Track(1, "Adelaide Street Circuit", R.drawable.adelaide_street_circuit, "Street circuit", "Clockwise", "Adelaide, Australia", "3.780 km (2.349 mi)", "Australian Grand Prix", "1985–1995", 11));
        tracks.add(new Track(2, "Ain-Diab Circuit", R.drawable.ain_diab_circuit, "Street circuit", "Clockwise", "Adelaide, Australia", "3.780 km (2.349 mi)", "Australian Grand Prix", "1985–1995", 11));
        tracks.add(new Track(3, "Aintree", R.drawable.aintree, "Street circuit", "Clockwise", "Adelaide, Australia", "3.780 km (2.349 mi)", "Australian Grand Prix", "1985–1995", 11));
        tracks.add(new Track(4, "Albert Park", R.drawable.albert_park, "Street circuit", "Clockwise", "Adelaide, Australia", "3.780 km (2.349 mi)", "Australian Grand Prix", "1985–1995", 11));
        tracks.add(new Track(5, "Autodromo Enzo e Dino Ferrari", R.drawable.autodromo_enzo_e_dino_ferrari, "Street circuit", "Clockwise", "Adelaide, Australia", "3.780 km (2.349 mi)", "Australian Grand Prix", "1985–1995", 11));
        tracks.add(new Track(6, "Autodromo Nazionale Monza", R.drawable.autodromo_nazionale_monza, "Street circuit", "Clockwise", "Adelaide, Australia", "3.780 km (2.349 mi)", "Australian Grand Prix", "1985–1995", 11));
        tracks.add(new Track(7, "Autódromo do Estoril", R.drawable.autodromo_do_estoril, "Street circuit", "Clockwise", "Adelaide, Australia", "3.780 km (2.349 mi)", "Australian Grand Prix", "1985–1995", 11));
        tracks.add(new Track(8, "Autódromo Hermanos Rodríguez", R.drawable.autodromo_hermanos_rodriguez, "Street circuit", "Clockwise", "Adelaide, Australia", "3.780 km (2.349 mi)", "Australian Grand Prix", "1985–1995", 11));
        tracks.add(new Track(9, "Autódromo Internacional Nelson Piquet", R.drawable.autodromo_internacional_nelson_piquet, "Street circuit", "Clockwise", "Adelaide, Australia", "3.780 km (2.349 mi)", "Australian Grand Prix", "1985–1995", 11));
        tracks.add(new Track(10, "Autódromo José Carlos Pace", R.drawable.autodromo_jose_carlos_pace, "Street circuit", "Clockwise", "Adelaide, Australia", "3.780 km (2.349 mi)", "Australian Grand Prix", "1985–1995", 11));
        tracks.add(new Track(11, "Autódromo Juan y Oscar Gálvez", R.drawable.autodromo_juan_y_oscar_galvez, "Street circuit", "Clockwise", "Adelaide, Australia", "3.780 km (2.349 mi)", "Australian Grand Prix", "1985–1995", 11));
        tracks.add(new Track(12, "AVUS", R.drawable.avus, "Street circuit", "Clockwise", "Adelaide, Australia", "3.780 km (2.349 mi)", "Australian Grand Prix", "1985–1995", 11));
        tracks.add(new Track(13, "Bahrain International Circuit", R.drawable.bahrain_international_circuit, "Street circuit", "Clockwise", "Adelaide, Australia", "3.780 km (2.349 mi)", "Australian Grand Prix", "1985–1995", 11));
        tracks.add(new Track(14, "Baku City Circuit", R.drawable.baku_city_circuit, "Street circuit", "Clockwise", "Adelaide, Australia", "3.780 km (2.349 mi)", "Australian Grand Prix", "1985–1995", 11));
        tracks.add(new Track(15, "Brands Hatch", R.drawable.brands_hatch, "Street circuit", "Clockwise", "Adelaide, Australia", "3.780 km (2.349 mi)", "Australian Grand Prix", "1985–1995", 11));
        tracks.add(new Track(16, "Buddh International Circuit", R.drawable.buddh_international_circuit, "Street circuit", "Clockwise", "Adelaide, Australia", "3.780 km (2.349 mi)", "Australian Grand Prix", "1985–1995", 11));
        tracks.add(new Track(17, "Bugatti Circuit", R.drawable.bugatti_circuit, "Street circuit", "Clockwise", "Adelaide, Australia", "3.780 km (2.349 mi)", "Australian Grand Prix", "1985–1995", 11));
        tracks.add(new Track(18, "Caesars Palace Grand Prix", R.drawable.caesars_palace_grand_prix, "Street circuit", "Clockwise", "Adelaide, Australia", "3.780 km (2.349 mi)", "Australian Grand Prix", "1985–1995", 11));
        tracks.add(new Track(19, "Charade Circuit", R.drawable.charade_circuit, "Street circuit", "Clockwise", "Adelaide, Australia", "3.780 km (2.349 mi)", "Australian Grand Prix", "1985–1995", 11));
        tracks.add(new Track(20, "Circuit Bremgarten", R.drawable.circuit_bremgarten, "Street circuit", "Clockwise", "Adelaide, Australia", "3.780 km (2.349 mi)", "Australian Grand Prix", "1985–1995", 11));
        return tracks;
    }

    public static List<Question> getQuestions() {
        List<Question> questions = new ArrayList<>();
        List<Track> questionAnswers = new ArrayList<>();

        List<Track> tracks = getTracks();
        for (int i = 0; i < TOTAL_QUESTION; i++) {
            questionAnswers.add(tracks.remove((int) (Math.random() * tracks.size())));
        }

        for (Track questionAnswer : questionAnswers) {
            String id = UUID.randomUUID().toString();
            int optionCount = TOTAL_OPTION;
            List<Track> options = new ArrayList<>();

            List<Track> trackList = getTracks();

            for (int i = 0; i < trackList.size(); i++) {
                if (trackList.get(i).getId() == questionAnswer.getId()) {
                    trackList.remove(i);
                    break;
                }
            }

            options.add(questionAnswer);

            for (int i = 0; i < optionCount - 1; i++) {
                options.add(trackList.remove((int) (Math.random() * trackList.size())));
            }

            List<Track> realOption = new ArrayList<>();

            for (int i = 0; i < optionCount; i++) {
                realOption.add(options.remove((int) (Math.random() * options.size())));
            }

            questions.add(new Question(id, optionCount, realOption, questionAnswer));
        }
        return questions;
    }
}