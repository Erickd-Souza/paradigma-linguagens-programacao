;Leia uma nota entre 0 e 100 e converta para o conceito:
;A (>=90),
;B (>=80),
;C (>=70),
;D (>=60),
;F (<60) 

(ns atividade.exercicio06)

(def letra-A "A")
(def letra-B "B")
(def letra-C "C")
(def letra-D "D")
(def letra-F "F")

(defn -main []
    (print "Nota (0-100): ")(flush)
    (let [n (Integer/parseInt (read-line))
        conceito (if (>= n 90)
                    letra-A
                    (if (>= n 80)
                        letra-B
                        (if (>= n 70)
                            letra-C
                            (if (>= n 60)
                                letra-D
                                letra-F
                            )
                        )
                    )
                 )
        ]
        (println "Conceito:" conceito)
    )
)