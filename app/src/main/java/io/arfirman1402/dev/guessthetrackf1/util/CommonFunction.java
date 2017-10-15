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
        tracks.add(new Track(21, "Circuit de Barcelona-Catalunya", R.drawable.circuit_de_barcelona_catalunya, "Street circuit", "Clockwise", "Adelaide, Australia", "3.780 km (2.349 mi)", "Australian Grand Prix", "1985–1995", 11));
        tracks.add(new Track(22, "Circuit de Monaco", R.drawable.circuit_de_monaco, "Street circuit", "Clockwise", "Adelaide, Australia", "3.780 km (2.349 mi)", "Australian Grand Prix", "1985–1995", 11));
        tracks.add(new Track(23, "Circuit de Nevers Magny-Cours", R.drawable.circuit_de_nevers_magny_cours, "Street circuit", "Clockwise", "Adelaide, Australia", "3.780 km (2.349 mi)", "Australian Grand Prix", "1985–1995", 11));
        tracks.add(new Track(24, "Circuit de Spa-Francorchamps", R.drawable.circuit_de_spa_francorchamps, "Street circuit", "Clockwise", "Adelaide, Australia", "3.780 km (2.349 mi)", "Australian Grand Prix", "1985–1995", 11));
        tracks.add(new Track(25, "Circuit Gilles Villeneuve", R.drawable.circuit_gilles_villeneuve, "Street circuit", "Clockwise", "Adelaide, Australia", "3.780 km (2.349 mi)", "Australian Grand Prix", "1985–1995", 11));
        tracks.add(new Track(26, "Circuit Mont-Tremblant", R.drawable.circuit_mont_tremblant, "Street circuit", "Clockwise", "Adelaide, Australia", "3.780 km (2.349 mi)", "Australian Grand Prix", "1985–1995", 11));
        tracks.add(new Track(27, "Circuit of the Americas", R.drawable.circuit_of_the_americas, "Street circuit", "Clockwise", "Adelaide, Australia", "3.780 km (2.349 mi)", "Australian Grand Prix", "1985–1995", 11));
        tracks.add(new Track(28, "Circuit Park Zandvoort", R.drawable.circuit_park_zandvoort, "Street circuit", "Clockwise", "Adelaide, Australia", "3.780 km (2.349 mi)", "Australian Grand Prix", "1985–1995", 11));
        tracks.add(new Track(29, "Circuit Paul Ricard", R.drawable.circuit_paul_ricard, "Street circuit", "Clockwise", "Adelaide, Australia", "3.780 km (2.349 mi)", "Australian Grand Prix", "1985–1995", 11));
        tracks.add(new Track(30, "Circuit Zolder", R.drawable.circuit_zolder, "Street circuit", "Clockwise", "Adelaide, Australia", "3.780 km (2.349 mi)", "Australian Grand Prix", "1985–1995", 11));
        tracks.add(new Track(31, "Circuito da Boavista", R.drawable.circuito_da_boavista, "Street circuit", "Clockwise", "Adelaide, Australia", "3.780 km (2.349 mi)", "Australian Grand Prix", "1985–1995", 11));
        tracks.add(new Track(32, "Circuito de Jerez", R.drawable.circuito_de_jerez, "Street circuit", "Clockwise", "Adelaide, Australia", "3.780 km (2.349 mi)", "Australian Grand Prix", "1985–1995", 11));
        tracks.add(new Track(33, "Circuito de Monsanto", R.drawable.circuito_de_monsanto, "Street circuit", "Clockwise", "Adelaide, Australia", "3.780 km (2.349 mi)", "Australian Grand Prix", "1985–1995", 11));
        tracks.add(new Track(34, "Circuito del Jarama", R.drawable.circuito_del_jarama, "Street circuit", "Clockwise", "Adelaide, Australia", "3.780 km (2.349 mi)", "Australian Grand Prix", "1985–1995", 11));
        tracks.add(new Track(35, "Detroit street circuit", R.drawable.detroit_street_circuit, "Street circuit", "Clockwise", "Adelaide, Australia", "3.780 km (2.349 mi)", "Australian Grand Prix", "1985–1995", 11));
        tracks.add(new Track(36, "Dijon-Prenois", R.drawable.dijon_prenois, "Street circuit", "Clockwise", "Adelaide, Australia", "3.780 km (2.349 mi)", "Australian Grand Prix", "1985–1995", 11));
        tracks.add(new Track(37, "Donington Park", R.drawable.donington_park, "Street circuit", "Clockwise", "Adelaide, Australia", "3.780 km (2.349 mi)", "Australian Grand Prix", "1985–1995", 11));
        tracks.add(new Track(38, "Fair Park", R.drawable.fair_park, "Street circuit", "Clockwise", "Adelaide, Australia", "3.780 km (2.349 mi)", "Australian Grand Prix", "1985–1995", 11));
        tracks.add(new Track(39, "Fuji Speedway", R.drawable.fuji_speedway, "Street circuit", "Clockwise", "Adelaide, Australia", "3.780 km (2.349 mi)", "Australian Grand Prix", "1985–1995", 11));
        /*tracks.add(new Track(40, "Grand Prix of Long Beach", R.drawable.grand_prix_of_long_beach, "Street circuit", "Clockwise", "Adelaide, Australia", "3.780 km (2.349 mi)", "Australian Grand Prix", "1985–1995", 11));*/
        tracks.add(new Track(41, "Hockenheimring", R.drawable.hockenheimring, "Street circuit", "Clockwise", "Adelaide, Australia", "3.780 km (2.349 mi)", "Australian Grand Prix", "1985–1995", 11));
        tracks.add(new Track(42, "Hungaroring", R.drawable.hungaroring, "Street circuit", "Clockwise", "Adelaide, Australia", "3.780 km (2.349 mi)", "Australian Grand Prix", "1985–1995", 11));
        tracks.add(new Track(43, "Indianapolis Motor Speedway", R.drawable.indianapolis_motor_speedway, "Street circuit", "Clockwise", "Adelaide, Australia", "3.780 km (2.349 mi)", "Australian Grand Prix", "1985–1995", 11));
        tracks.add(new Track(44, "Istanbul Park", R.drawable.istanbul_park, "Street circuit", "Clockwise", "Adelaide, Australia", "3.780 km (2.349 mi)", "Australian Grand Prix", "1985–1995", 11));
        tracks.add(new Track(45, "Korea International Circuit", R.drawable.korea_international_circuit, "Street circuit", "Clockwise", "Adelaide, Australia", "3.780 km (2.349 mi)", "Australian Grand Prix", "1985–1995", 11));
        tracks.add(new Track(46, "Kyalami", R.drawable.kyalami, "Street circuit", "Clockwise", "Adelaide, Australia", "3.780 km (2.349 mi)", "Australian Grand Prix", "1985–1995", 11));
        tracks.add(new Track(47, "Marina Bay Street Circuit", R.drawable.marina_bay_street_circuit, "Street circuit", "Clockwise", "Adelaide, Australia", "3.780 km (2.349 mi)", "Australian Grand Prix", "1985–1995", 11));
        tracks.add(new Track(48, "Montjuïc circuit", R.drawable.montjuic_circuit, "Street circuit", "Clockwise", "Adelaide, Australia", "3.780 km (2.349 mi)", "Australian Grand Prix", "1985–1995", 11));
        tracks.add(new Track(49, "Mosport International Raceway", R.drawable.mosport_international_raceway, "Street circuit", "Clockwise", "Adelaide, Australia", "3.780 km (2.349 mi)", "Australian Grand Prix", "1985–1995", 11));
        tracks.add(new Track(50, "Nivelles-Baulers", R.drawable.nivelles_baulers, "Street circuit", "Clockwise", "Adelaide, Australia", "3.780 km (2.349 mi)", "Australian Grand Prix", "1985–1995", 11));
        tracks.add(new Track(51, "Nürburgring", R.drawable.nurburgring, "Street circuit", "Clockwise", "Adelaide, Australia", "3.780 km (2.349 mi)", "Australian Grand Prix", "1985–1995", 11));
        tracks.add(new Track(52, "Pedralbes Circuit", R.drawable.pedralbes_circuit, "Street circuit", "Clockwise", "Adelaide, Australia", "3.780 km (2.349 mi)", "Australian Grand Prix", "1985–1995", 11));
        tracks.add(new Track(53, "Pescara Circuit", R.drawable.pescara_circuit, "Street circuit", "Clockwise", "Adelaide, Australia", "3.780 km (2.349 mi)", "Australian Grand Prix", "1985–1995", 11));
        tracks.add(new Track(54, "Phoenix street circuit", R.drawable.phoenix_street_circuit, "Street circuit", "Clockwise", "Adelaide, Australia", "3.780 km (2.349 mi)", "Australian Grand Prix", "1985–1995", 11));
        tracks.add(new Track(55, "Prince George Circuit", R.drawable.prince_george_circuit, "Street circuit", "Clockwise", "Adelaide, Australia", "3.780 km (2.349 mi)", "Australian Grand Prix", "1985–1995", 11));
        tracks.add(new Track(56, "Red Bull Ring / A1-Ring / Österreichring", R.drawable.red_bull_ring, "Street circuit", "Clockwise", "Adelaide, Australia", "3.780 km (2.349 mi)", "Australian Grand Prix", "1985–1995", 11));
        tracks.add(new Track(57, "Reims-Gueux", R.drawable.reims_gueux, "Street circuit", "Clockwise", "Adelaide, Australia", "3.780 km (2.349 mi)", "Australian Grand Prix", "1985–1995", 11));
        tracks.add(new Track(58, "Riverside International Raceway", R.drawable.riverside_international_raceway, "Street circuit", "Clockwise", "Adelaide, Australia", "3.780 km (2.349 mi)", "Australian Grand Prix", "1985–1995", 11));
        tracks.add(new Track(59, "Rouen-Les-Essarts", R.drawable.rouen_les_essarts, "Street circuit", "Clockwise", "Adelaide, Australia", "3.780 km (2.349 mi)", "Australian Grand Prix", "1985–1995", 11));
        tracks.add(new Track(60, "Scandinavian Raceway", R.drawable.scandinavian_raceway, "Street circuit", "Clockwise", "Adelaide, Australia", "3.780 km (2.349 mi)", "Australian Grand Prix", "1985–1995", 11));
        tracks.add(new Track(61, "Sebring International Raceway", R.drawable.sebring_international_raceway, "Street circuit", "Clockwise", "Adelaide, Australia", "3.780 km (2.349 mi)", "Australian Grand Prix", "1985–1995", 11));
        tracks.add(new Track(62, "Sepang International Circuit", R.drawable.sepang_international_circuit, "Street circuit", "Clockwise", "Adelaide, Australia", "3.780 km (2.349 mi)", "Australian Grand Prix", "1985–1995", 11));
        tracks.add(new Track(63, "Shanghai International Circuit", R.drawable.shanghai_international_circuit, "Street circuit", "Clockwise", "Adelaide, Australia", "3.780 km (2.349 mi)", "Australian Grand Prix", "1985–1995", 11));
        tracks.add(new Track(64, "Silverstone Circuit", R.drawable.silverstone_circuit, "Street circuit", "Clockwise", "Adelaide, Australia", "3.780 km (2.349 mi)", "Australian Grand Prix", "1985–1995", 11));
        tracks.add(new Track(65, "Sochi Autodrom", R.drawable.sochi_autodrom, "Street circuit", "Clockwise", "Adelaide, Australia", "3.780 km (2.349 mi)", "Australian Grand Prix", "1985–1995", 11));
        tracks.add(new Track(66, "Suzuka Circuit", R.drawable.suzuka_circuit, "Street circuit", "Clockwise", "Adelaide, Australia", "3.780 km (2.349 mi)", "Australian Grand Prix", "1985–1995", 11));
        tracks.add(new Track(67, "Tanaka International Circuit", R.drawable.tanaka_international_circuit, "Street circuit", "Clockwise", "Adelaide, Australia", "3.780 km (2.349 mi)", "Australian Grand Prix", "1985–1995", 11));
        tracks.add(new Track(68, "Valencia Street Circuit", R.drawable.valencia_street_circuit, "Street circuit", "Clockwise", "Adelaide, Australia", "3.780 km (2.349 mi)", "Australian Grand Prix", "1985–1995", 11));
        tracks.add(new Track(69, "Watkins Glen", R.drawable.watkins_glen, "Street circuit", "Clockwise", "Adelaide, Australia", "3.780 km (2.349 mi)", "Australian Grand Prix", "1985–1995", 11));
        tracks.add(new Track(69, "Yas Marina Circuit", R.drawable.yas_marina_circuit, "Street circuit", "Clockwise", "Adelaide, Australia", "3.780 km (2.349 mi)", "Australian Grand Prix", "1985–1995", 11));
        tracks.add(new Track(69, "Zeltweg Airfield", R.drawable.zeltweg_airfield, "Street circuit", "Clockwise", "Adelaide, Australia", "3.780 km (2.349 mi)", "Australian Grand Prix", "1985–1995", 11));
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