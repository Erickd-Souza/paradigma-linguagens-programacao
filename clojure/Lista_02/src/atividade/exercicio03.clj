; Leia peso (kg) e altura (m), calcule o IMC e classifique: abaixo de 18.5, normal até 24.9, sobrepeso até 29.9 e obesidade acima disso.

(ns atividade.exercicio03)

(def msg-abaixo "Abaixo do peso")
(def msg-normal "Peso normal")
(def msg-sobre "Sobrepeso")
(def msg-obes "Obesidade")

(defn -main []
    (print "Peso (KG): ") (flush)
    (let [peso (Double/parseDouble (read-line))]
    (print "Altura (m) exemplo 1.75: ") (flush)
        (let [altura (Double/parseDouble (read-line))
            imc (/ peso (* altura altura))]
            (println "IMC:" imc)
            (if (< imc 18.5)
                (println msg-abaixo)
                (if (<= imc 24.9)
                    (println msg-normal)
                    (if (<= imc 29.9)
                        (println msg-sobre)
                        (println msg-obes)
                    )
                )
            )
        )  
    )
)