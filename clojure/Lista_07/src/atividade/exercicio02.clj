;Permita ao usuário cadastrar 3 alunos (nome e nota) e mostre o status de aprovação (≥ 6).

(ns atividade.exercicio02)

(defn cadastrar-alunos [qtd]
    (loop [i 0 alunos []]
        (if (= i qtd)
            alunos
            (do 
                (print "Nome do Aluno:") (flush)
                (let [nome (read-line)]
                    (print "Nota:") (flush)
                    (let [nota (Double/parseDouble (read-line))
                        aluno {:nome nome :nota nota}]
                        (recur (inc i) (conj alunos aluno))
                    )
                )
            )
        )
    )
)

(defn -main []
    (let [dados (cadastrar-alunos 3)
        resultado (map #(assoc % :status (if (>= (:nota %) 6) "Aprovado" "Reprovado")) dados)]
        (println "Resultado final:")
        (doseq [a resultado]
            (println (:nome a) "-" (:status a))
        )
    )
)