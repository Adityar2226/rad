(ns rad.core
  (:use compojure.core
        ring.middleware.json
        ring.util.response)
  (:require [compojure.route :as route]
            [rad.view :as view]))
(defn -main [x] (str "Hello,",x))
(defroutes my_routes
           (GET "/" [] (view/index-page))
           (GET "/rest" [] (response {:email "adityarana@gmail"}))
           (route/resources "/"))
(def app (wrap-json-response my_routes))