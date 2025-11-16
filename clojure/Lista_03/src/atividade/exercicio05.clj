;Leia a temperatura ambiente e, se for maior que 30°C, exiba as mensagens 'Dia quente!' e 'Hidrate-se bem!'.

(ns atividade.exercicio05)

(defn -main []
    (print "Temperatura (°C): ") (flush)
    (let [t (Double/parseDouble (read-line))]
        (when (> t 30)
            (println "Dia Quente!")
            (println "Hidrate-se bem!")
        )
    )
)