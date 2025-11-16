; Crie duas funções: `dobrar` e `incrementar`. Use `comp` para criar uma nova função `dobrar-e-incrementar`.

(ns atividade.exercicio05)

(defn dobrar [n] (* n 2))
(defn incrementar [n] (inc n))
(def dobrar-e-incrementar (comp incrementar dobrar))

(defn -main []
    (println (dobrar-e-incrementar 5))
)