; Adicione um novo nome ao vetor original com conj, exibindo o vetor antigo e o novo.

(ns atividade.exercicio02)

(def nomes ["Ana" "Bruno" "Carlos"])

(defn -main []
    (let [novos (conj nomes "Fernanda")]
        (println "Original:" nomes)
        (println "Com novo elemento:" novos)
    )
)