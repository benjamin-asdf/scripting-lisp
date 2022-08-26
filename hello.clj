#!/usr/bin/env bb

(require '[cheshire.core :as json])

(defn main []
  (when-not (fs/exists? "hurr") (fs/copy "hello.clj" "hurr"))
  (println
   (->> (range) (take 8) (map inc) (filter even?) (interleave (repeat 0))))
  (println (json/decode "{\"foo\": 10}"))
  (println
   (->
    (curl/get "https://postman-echo.com/get" {:query-params {"q" "clojure"}})
    :body
    (json/parse-string true)
    :args)))

(main)
