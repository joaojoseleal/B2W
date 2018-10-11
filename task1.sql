SELECT e.event_type, (e.value - e1.value) AS value 
FROM events e
JOIN events e1 ON e.event_type = e1.event_type AND
e.time = (SELECT time FROM events t WHERE
           t.event_type=e.event_type ORDER BY time DESC LIMIT 1 OFFSET 1)
AND
e1.time = (SELECT time FROM events t1 WHERE
           t1.event_type=e1.event_type ORDER BY time ASC LIMIT 1)
