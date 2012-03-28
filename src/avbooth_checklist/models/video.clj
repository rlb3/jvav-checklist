(ns avbooth-checklist.models.video)

(def pre-counter (atom 0))
(def pre-checks (atom []))

(def post-counter (atom 0))
(def post-checks (atom []))

(defn add-pre-check [task]
  (swap! pre-counter inc)
  (swap! pre-checks conj {:id @pre-counter :task task}))

(defn get-pre-checks []
  @pre-checks)

(defn add-post-check [task]
  (swap! post-counter inc)
  (swap! post-checks conj {:id @post-counter :task task}))

(add-pre-check "Turn on the outside monitor")
(add-pre-check "Turn on all monitors in the booth")
(add-pre-check "Set out camera to the correct view")
(add-pre-check "Setup Garage Band")