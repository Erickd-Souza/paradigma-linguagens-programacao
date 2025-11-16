;Leia a renda mensal e aplique a alíquota: até 2000 = 0%, até 4000 = 7.5%, até 8000 = 15%, acima de 8000 = 22.5%.

(ns atividade.exercicio04)

(def ali-isenta 0.00)
(def ali-a 0.075)
(def ali-b 0.15)
(def ali-c 0.255)

(defn -main []
    (print "Renda mensal: ")(flush)
    (let [renda (Double/parseDouble (read-line))
        ali (if (<= renda 2000)
                ali-isenta
                (if (<= renda 4000)
                    ali-a
                    (if (<= renda 8000)
                        ali-b
                        ali-c
                    )
                )
            )
        imposto (* renda ali)
        ]
        (println "Aliquota aplicada:" (* ali 100) "%")
        (println "Imposto devido:" imposto)
    )
)