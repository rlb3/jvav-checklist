(ns avbooth-checklist.views.common
  (:use [noir.core :only [defpartial]]
        [hiccup.page-helpers :only [include-css html5 include-js]]))

(defpartial layout [& content]
            (html5
              [:head
               [:title "JV Audio / Video Booth checklist"]
               (include-css "/css/bootstrap.min.css")
               (include-css "/css/bootstrap-responsive.min.css")
               (include-js "http://code.jquery.com/jquery-1.7.2.min.js")
               (include-js "/js/bootstrap.min.js")
               (include-js "/js/av.js")]
              [:body
               [:div#wrapper
                content]]))
