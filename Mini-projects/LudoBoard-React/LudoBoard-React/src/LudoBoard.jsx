import './LudoBoard.css'
import { useState } from 'react'

export default function Ludoboard(){
        let[Moves, setMoves] = useState({yellow : 0,green : 0, red : 0, blue : 0})

        function upBlue(){
            setMoves((preMoves)=>{
                return {...preMoves , blue : preMoves.blue++}});
        }
        function upGreen(){
            setMoves((preMoves)=>{
                return {...preMoves , green : preMoves.green++ }});
        }
        function upRed(){
            setMoves((preMoves)=>{
                return {...preMoves , red :preMoves.red++ }});
        }
        function upYellow(){
            setMoves((preMoves)=>{
                return {...preMoves , yellow : preMoves.yellow++}});
        }

    return(
        <>
        <h3>Ludoboard</h3>
        <div className="board">
            <div className="innerBlocks">
                <p>Blue moves = {Moves.blue}</p>
                <button onClick={upBlue} style={{backgroundColor : "blue"}}>Blue</button>
                <p>Red moves = {Moves.red}</p>
                <button onClick={upRed} style={{backgroundColor : "red"}}>Red</button>
            </div>
            <div className="innerBlocks">
                <p>Yellow moves = {Moves.green}</p>
                <button onClick={upGreen} style={{backgroundColor : "green"}}>Yellow</button>
                <p>Green moves = {Moves.yellow}</p>
                <button onClick={upYellow} style={{backgroundColor : "yellow"}}>Green</button>
            </div>
        </div>
        </>
    )
}