;Leia uma nota (0–100) e classifique o desempenho do aluno: Reprovado, Regular, Bom, Muito bom ou Excelente.

(ns atividade.exercicio01)

(defn -main []
    (print "Digite a nota (0-100): ") (flush)
    (let [nota (Integer/parseInt (read-line))]
        (cond
            (< nota 60) (println "Reprovado")
            (< nota 70) (println "Regular")
            (< nota 80) (println "Bom")
            (< nota 90) (println "Muito bom")
            :else (println "Excelente")
        )
    )
)