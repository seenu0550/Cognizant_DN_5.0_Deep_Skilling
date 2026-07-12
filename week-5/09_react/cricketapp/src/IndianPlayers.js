import React from "react";

function IndianPlayers() {

    const team = [
        "Virat",
        "Rohit",
        "Gill",
        "Rahul",
        "Ms Dhoni",
        "Hardik"
    ];

    // Destructuring
    const [odd1, even1, odd2, even2, odd3, even3] = team;

    const T20Players = [
        "Virat",
        "Rohit",
        "Surya",
        "Ms Dhoni"
    ];

    const RanjiPlayers = [
        "Pujara",
        "Rahane",
        "Iyer"
    ];

    // Merge Arrays
    const mergedPlayers = [...T20Players, ...RanjiPlayers];

    return (
        <div>

            <h2>Odd Team Players</h2>
            <p>{odd1}</p>
            <p>{odd2}</p>
            <p>{odd3}</p>

            <h2>Even Team Players</h2>
            <p>{even1}</p>
            <p>{even2}</p>
            <p>{even3}</p>

            <h2>Merged Players</h2>

            {mergedPlayers.map((player, index) => (
                <p key={index}>{player}</p>
            ))}

        </div>
    );
}

export default IndianPlayers;