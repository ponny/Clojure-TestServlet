(ns com.fightcodeentropy.TestServlet
  (:gen-class
   :extends javax.servlet.http.HttpServlet)
  (:import [java.io PrintWriter]))

(defn -doGet [this request response]
  (.setContentType response "text/html")
  (let [out (.getWriter response)]
    (doto out
      (.println "<html>")
      (.println "<head><title>Hello Clojure!</title></head>")
      (.println "<body>")
      (.println "<h1>Hello Clojure!</h1>")
      (.println "</body>")
      (.println "</html>"))))
