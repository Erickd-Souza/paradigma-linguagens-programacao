; Crie um mapa representando um aluno e adicione a chave :status baseada na :nota (>= 60 aprovado, caso contrário reprovado).
(ns atividade.exercicio03)

(def aluno {:nome "João" :nota 72 :curso "Engenharia"})

(defn -main []
    (let [status (if (>= (:nota aluno) 60) :aprovado :reprovado)
        aluno2 (assoc aluno :status status)]
        (println aluno2) 
    )
)