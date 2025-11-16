; Crie uma função `saudar` que receba um nome e retorne uma mensagem de saudação personalizada.

(ns atividade.exercicio01)

(defn saudar [nome]
    (str "Olá, " nome "! Seja bem-vindo.")
)

(defn -main []
    (println (saudar "Erick"))
)