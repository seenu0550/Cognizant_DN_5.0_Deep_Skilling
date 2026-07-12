import React from "react";

function ListofPlayers() {

    const players = [
        { name: "Virat", score: 95 },
        { name: "Rohit", score: 80 },
        { name: "Gill", score: 65 },
        { name: "Rahul", score: 60 },
        { name: "Ms Dhoni", score: 100 },
        { name: "Hardik", score: 85 },
        { name: "Jadeja", score: 55 },
        { name: "Ashwin", score: 68 },
        { name: "Shami", score: 72 },
        { name: "Bumrah", score: 88 },
        { name: "Siraj", score: 50 }
    ];

    const lowScorers = players.filter(player => player.score < 70);

    return (
        <div>
            <h2>List of Players</h2>

            <h3>All Players</h3>

            {players.map((player, index) => (
                <p key={index}>
                    {player.name} - {player.score}
                </p>
            ))}

            <h3>Players with score below 70</h3>

            {lowScorers.map((player, index) => (
                <p key={index}>
                    {player.name} - {player.score}
                </p>
            ))}
        </div>
    );
}

export default ListofPlayers;